package liucheng

def clouser = {println 'hello groovy!'}
clouser.call()
clouser()

//闭包的参数
def varcloser = { String name -> println "jettus s s ${name}"}
varcloser.call('groovy')

