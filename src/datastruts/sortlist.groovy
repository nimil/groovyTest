package datastruts


def sortlist = [21321,3213,21,321,312]

//Comparator mc = {a,b -> a==b ? 0: Math.abs(a)<Math.abs(b)?-1:1}
//Collections.sort(sortlist,mc)
//println sortlist.toListString()

sortlist.sort{a,b -> a==b?0:Math.abs(a)<Math.abs(b)?1:-1}

println sortlist

def sorstrlist = ['java','python','go']

sorstrlist.sort
        {return it.size()}
println sorstrlist