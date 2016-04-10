using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace FlyWeight
{
   public class Program
    {
        public  static void Main(string[] args)
        {
            new Program();
        }
        public Program(){
            long startTime = DateTime.Now.Millisecond;
            for (int i = 0; i <= 10000000; i++)
            {
                AccountMaker.getAccount(GetRandomeAccount()).printInformation();

            }
            long endTime = DateTime.Now.Millisecond;
            Console.WriteLine("Total time : " + (endTime - startTime).ToString() + " MS");
            Console.ReadLine();
        }
       public AccountType GetRandomeAccount(){
           Random myRand = new Random();
           int number = myRand.Next(8);
           switch(number){
                case 1 : return AccountType.Current;
                case 2 : return AccountType.employee;
                case 3 : return AccountType.fc;
                case 4 : return AccountType.premium;
                case 5 : return AccountType.rfcd;
                case 6 : return AccountType.Salary;
                case 7 : return AccountType.Savings;
                default: return AccountType.student;
           }
       }
    }
}
