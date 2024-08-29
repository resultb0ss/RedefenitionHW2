fun main() {
    var array = arrayOf("СТРОКА 1","создать класс","массив строк","самое длинное слово","класс наследует свойства родителя")
    var maxStr = array[0]
    for (str in array.indices){
        if(maxStr.length < array[str].length){
            maxStr = array[str]
        }

    }
    println("Самая длинная строка в масиве -- $maxStr --, ее размер ${maxStr.length} символов")
}