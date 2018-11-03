package liucheng

def x = 1.23

def result
switch (x.class){
    case 'foo':
         result = 'found foo'
        break
    case 'bar':
          result = 'bar'
        break
    case [4,5,6,'inilist']:
        result = 'list'
        break
    case 12..30:
        result = 'range'
        break
    case Integer:
        result = 'integer'
        break
    case BigDecimal:
        result = 'bigdecimal'
        break
}
println result