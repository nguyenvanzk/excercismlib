object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        val list = mutableListOf<Any>()

        for (item in source) {
            if (item is List<*>) {
                list.addAll(flatten(item))
            } else {
                if (item != null) {
                    list.add(item)
                }
            }
        }

        return list
    }
}
