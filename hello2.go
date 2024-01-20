package main
import "fmt"
func main() {
	var x int
	x=3*3+10
	fmt.Println(x)

	x=5
	x=x+1
	x+=2
	fmt.Println(x)

	x-=2
	fmt.Println(x)

	// var result bool=4<3

	var result bool=4==3
	fmt.Println(result)
	result=4==4
	fmt.Println(result)

	result=4!=4
	fmt.Println(result)

	result=!true
	fmt.Println(result)

	result=!false
	fmt.Println(result)


	// false
	result=true&&false
	fmt.Println(result)


	// true
	result=false||true
	fmt.Println(result)

	




}

//
