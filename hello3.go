package main

import "fmt"


// func add(a, b int) int {
// 	return a + b
// }

func add(a int, b int) int{
	var result int=a+b
	// fmt.Println(result)
	return result
}

func sum(min int,max int) int {
	var result int=0
	var n int
	for n=min;n<=max;n++ {
		result+=n
	}
	fmt.Println(result)

	return result

}

func multiply(n1 int,n2 int) (int) {
	var result int=n1*n2
	return result
}


func show(msg string){
	if msg=="Hello"{
		return
	}
	fmt.Println(msg)
}


func test()(int,string){
	return 5,"Test"
}



func main() {
	if !false{
		fmt.Println("go")
	}else{
		fmt.Println("not go")
	}


	// var result int= add(3,4)
	var a int=add(3,4)
	fmt.Println(a)

	sum(1,100)

	var x int=multiply(3,4)
	fmt.Println(x)

	var m int
	var n string

	m,n=test()
	fmt.Println(m,n)
	// var money int
	// fmt.Scanln(&money)
	// if money<100{
	// 	fmt.Println("Too Few")
	// }else if money<=100000{
	// 	fmt.Println("OK")
	// }else{
	// 	fmt.Println("Too Much")
	// }

	// if money>=100000{
	// 	// return("too much")
	// }




}

//
