package liucheng

def x = 4

def result
switch (x){
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
    default:
        result = 'default'
}
println result

//对范围的for循环

def sum = 0

for(i in 0..9){
    sum += i
}
println sum

//对list的循环


for (i in [1,2,3,4,5,6,7,8,9]){
    sum+=i
}
println sum

for (i in ['lili':1,'lucy':2]){
    sum+=i.value
}
println sum