




object Q1 extends App {
  class Rational(n1:Int,n2:Int){
    def numer = n1;
    def dino = n2;
    
    def neg = new Rational(- this.numer,this.dino);
    override def toString = "[" + this.numer + "/" + this.dino + "]";
    
  }
  
  val K = new Rational(2,4);
  println(K)
  val B = K.neg;
  print(B);
  
}