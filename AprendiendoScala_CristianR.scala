// Databricks notebook source
println("hola, mundo!")

// COMMAND ----------

4*9

// COMMAND ----------

res3+2

// COMMAND ----------

res4-10

// COMMAND ----------

(30*9/5)+32

// COMMAND ----------

val x="soy cristian"
x

// COMMAND ----------

"H"+"ol"+"a"

// COMMAND ----------

for (x <- 1 to 13) {println(s"Iteración n° $x:")}

// COMMAND ----------

for (x<-1 to 7) yield {s"Día $x"}

// COMMAND ----------

val threes = for (i <-1 to 25 if i%3==0) yield i

// COMMAND ----------

var cris = "Kappa";


cris match
{
  case null =>"n/a";
  case _ => cris;
  }

// COMMAND ----------



// COMMAND ----------

val d:Double=128

if (d>0) {
  print ("postitivo")
}
else {
  if (d==0){
    print("zero")
  }
  else
  {
    print("negativo")
  }
}

// COMMAND ----------

var x=1
while (x<=100){
  println (x)
  x=x+1
}

// COMMAND ----------

var x=1
do{
  println (x)
  x=x+1
}while(x<=100)

// COMMAND ----------

for (x<-1 to 100) {println(s"iteracion $x")}

// COMMAND ----------

for (x<-1 to 100) {
  if (x%5!=0){
    println(s"iteracion $x")
             }
   }

// COMMAND ----------

def multiplicacion (x: Int, y: Int): Int= {x*y}

// COMMAND ----------

multiplicacion (8,9)


// COMMAND ----------


