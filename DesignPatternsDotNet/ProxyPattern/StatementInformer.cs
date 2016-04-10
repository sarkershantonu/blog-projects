using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProxyPattern
{
    public class StatementInformer: IBalanceInformation
    {
        private IBalanceInformation myAccount = null;
        public StatementInformer(IBalanceInformation account)
        {
            myAccount = account;
        }
        public StatementInformer()
        {

        }
        public double GetBalance()
        {
            if (myAccount == null)
            {
                myAccount = new Account();
            }
            return myAccount.GetBalance();
        }
    }
}
