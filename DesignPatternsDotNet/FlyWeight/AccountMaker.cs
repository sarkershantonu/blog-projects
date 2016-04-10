using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace FlyWeight
{
    public class AccountMaker {
        private static Dictionary<AccountType, Account> myAccounts = new Dictionary<AccountType, Account>();

        public static Account getAccount(AccountType aType)
        {
            Account myAccount;
            if (myAccounts.ContainsKey(aType))
            {
                myAccount = (Account)myAccounts[aType];
                if (myAccount == null)
                {
                    myAccount = new Account(aType);
                    myAccounts.Add(aType, myAccount);
                    Console.WriteLine("Object Added in Dictonary " + myAccounts.Count);
                }
            }
            else
            {
                myAccount = new Account(aType);
                myAccounts.Add(aType, myAccount);
                Console.WriteLine("Object Added in Dictonary " + myAccounts.Count);
            }
		//myAccount = new Account(aType);
		//myAccounts.Add(aType, myAccount);
		return myAccount;
	}
}
}
