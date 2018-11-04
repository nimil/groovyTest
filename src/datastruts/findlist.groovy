package datastruts

def findlist = [-3,2,2,3,23,23,23,324,3,4,]
int result = findlist.find{
    return it%2 == 0
}
println result

def oushulist = findlist.findAll {return  it % 2 == 0}

println oushulist.toListString()

def count = findlist.count{
    return it%2 == 0
}

println count