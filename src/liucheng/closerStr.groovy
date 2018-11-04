package liucheng;

String str = 'the 2 and 3 is 5';

str.each {
    String temp -> print temp
}

println str.find{
    String s-> s.isNumber()
}

def list = str.findAll {
    String s -> s.isNumber()
}
println list.toListString()

println str.any{
    String s->s.isNumber()
}

def liststrup = str.collect{
    it.toUpperCase()
}
println liststrup.toListString()


def scriptvarible = {
    println this
    println owner
    println delegate
}

scriptvarible.call()

class Person{

    def static classClouser = {
        println this
        println owner
        println delegate
    }

    def  say(){
        def classClouser = {
            println this
            println owner
            println delegate
        }
        classClouser()
    }
}

Person p = new Person()
//Person.classClouser()
//Person.say()
p.say()

def nestClouser = {
    def innerClouser = {
        println this
        println owner
        println delegate
    }
    innerClouser()
}

nestClouser.call()


class Teacher{
    String name
}