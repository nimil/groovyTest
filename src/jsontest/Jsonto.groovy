package jsontest

import groovy.json.JsonOutput
import groovy.json.JsonSlurper


def lsit  = [new Person(name:'zhangsan',age:18),
             new Person(name:'dahao',age:223)]

def json =  JsonOutput.toJson(lsit)

def jsonspi = new JsonSlurper()

jsonspi.parse()