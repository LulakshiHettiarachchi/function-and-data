
import Q3.Account

object Q4 extends App {
  var bank:List[Account] = List()
 
  var Print = (a:List[Account])=>(a.map(x => println(x)));
  
  val find=(n:String,b:List[Account])=>b.filter(x=>x.nic.equals(n))
  
  val overdraft = (b:List[Account])=>b.filter(x => (x.balance < 0))
  
  val sum  = (b:List[Account])=> b.reduce((x,y) => new Account("",0,"",x.balance + y.balance)).balance
  
  val cal =(x:Account)=>if(x.balance < 0) x.balance * 1  else x.balance*0.5
  
  val interest=(b:List[Account])=>b.map(x => x.deposit(cal(x)))
  
  
  var user1 = new Account("199832365788",562311444,"Kamal",560.6)
  var user2 = new Account("199975810124",523655899,"Nimal",57000.84)  
  var user3 = new Account("200156321114",325423565,"Lalani",-50.6)
  var user4 = new Account("200056823214",112565985,"Nayana",45000)
  
  bank = List(user1,user2,user3,user4)

  println(overdraft(bank))
  
  println("Sum " + sum(bank))
  
  interest(bank)
  
  Print(bank)
  
}