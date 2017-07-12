import java.util.ArrayList;
import java.util.List;

public class Account {
 int sum(int a, int b){
	return a+b; 
 }
}
class loanAccount extends Account{
	
}
class JointLoanAccount extends loanAccount{



public static void main(String [] args){
Object obj = new Account();
Account acc = new loanAccount();
//List<?extends Account> accounts = new ArrayList<loanAccount>();
List<? super JointLoanAccount> accounts = new ArrayList<loanAccount>();

}}