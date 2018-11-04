package liucheng

def clouser = {println 'hello groovy!'}
clouser.call()
clouser()

//闭包的参数，参数个数使用，隔开
def varcloser = { String name -> println "jettus s s ${name}  "}
def res = varcloser.call('groovy')

//隐士参数
def vardefss = { println "hello ${it}"}

vardefss.call('ssss')

//闭包一定有参数返回
println res

