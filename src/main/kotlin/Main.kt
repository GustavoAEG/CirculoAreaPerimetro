fun main(args: Array<String>) {


    val diametro:Int?
    val area:Double?
    val perimetro:Double?
    val raio:Double?
    val pi= 3.14


    println("Informe o diâmetro")
    diametro = readLine()!!.toInt()


perimetro = diametro*pi

raio=diametro.toDouble()/2

    area=pi*(raio*raio)

    println("o raio é de $raio centimetros a area de $area centimetros e perimetro de $perimetro centimetros")




}