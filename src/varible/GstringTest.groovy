package varible


    def name = 'a single string'
    println name.class

def thuplename = '''three single string'''

println thuplename
println thuplename.class

def doublename = "this is a common string"
println doublename.class

def names = "limin"
def sayHello = "hello:${names}"
println sayHello
println sayHello.class

def sum = "3+2 add res is ${3+2}"
println sum
println sum.class

def res = echo(sum)
println res
println res.class
String echo(String message){
    return message
}
//println

def str1 = "groovy"
println str1.center(8)

println str1.padLeft(8,'a')
println str1.padRight(8,'a')

def str2 = "Hello"
println str1>str2

println str1[0]
println str1[0..1]

def str3 = "hello world"
def str4 = "hello"
println str3.minus(str4)

println str3.reverse()
println str3.capitalize()

