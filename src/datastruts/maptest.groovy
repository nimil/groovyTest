package datastruts

def smap = [name:'limin',age:'limin']
println smap['name']

println smap.name

smap.score = '100'

println smap.score

smap.ss = [tt:'sss']

println smap.toMapString()

println smap.getClass()

