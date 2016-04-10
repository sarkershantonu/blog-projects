using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using FlyWeight;

namespace FlyWeight
{
   public enum AccountType {
        Current,Savings,Salary,student,employee,premium,fc,rfcd,
    }
   public class Account
   {
       private string name = "Shantonu Blog";
       private AccountType type;
       public void setName(string name)
       {
           this.name = name;
       }
       private static long objectCounter = 1;
       public Account(AccountType aType)
       {
           this.type = aType;
           Console.WriteLine("Object number : " + objectCounter++);
       }
       public string Name
       {
           get
           {
               return name;
           }
           set { name = value; }
       }

       public void printInformation()
       {
           Console.WriteLine("Account Name = " + this.Name + ", Account type = " + type.ToString());
       }
   }
}
