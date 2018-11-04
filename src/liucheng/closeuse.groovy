package liucheng

int x = fab(5)
println x

int fab(int number){
    int result = 1
    1.upto(number,{num -> result*=num})
    return result
}

int y = fab2(5)
println y

int fab2(int number){
    int result = 1
    number.downto(1){
        num -> result*=num
    }
    return result
}

println cal(100)

int cal(int number){
    int result = 0
    number.times {
        num -> result+=num
    }
    return result
}
