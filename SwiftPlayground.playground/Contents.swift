//: Playground - noun: a place where people can play

import UIKit

var welcomMessage:String = "Hello there !!!";

let a = 10;

if (a < 10) {
    welcomMessage = "condition statisfy";
}

for index in 1...6{
    print(index)
}


func addNumbers(_ num1:Int, _ num2:Int) -> Int{
    return num1+num2;
}

addNumbers(12, 12);


class Person {
    var name = "";
    var age:Int?
    var sex = "";
    
    init() {
        print("Person init method")
    }
    func getFullName() -> String {
        return "\(name) Swift Programmer";
        //return name + " Swift programmer";
    }
}

let personObj = Person();
personObj.name = "BBQ";
personObj.age = 55;
personObj.age;
personObj.getFullName();

let array = ["bike","car","duke"]
let animal = ["Dog","cat","dino","duck","rabit"]

var finalArray = (array + animal).map{$0.lowercased()}
//finalArray = finalArray.map{$0.lowercased()}
let queryString = "dog"
if(finalArray.contains(queryString)){
    print("\(queryString) exists")
}

class StringCaterPillar {
    var finalName = "";
    init(_ name:String){
        self.finalName = name;
    }
    init(){
        
    }
    func add (_ name:String){
        finalName += name;
    }
    func go(){
        print(finalName);
    }
}

let obj = StringCaterPillar("welcome ");
obj.add("G");
obj.add("o");
obj.add("p");
obj.add("i");
obj.go()
