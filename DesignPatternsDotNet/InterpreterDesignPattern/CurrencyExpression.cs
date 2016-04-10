using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace InterpreterDesignPattern
{
    public abstract class CurrencyExpression
    {
        public abstract double usd(int input);
        public abstract double gbp(int input);
        public abstract double bdt(int input);
        public abstract double myr(int input);
        public void interpret(CurrencyContext acontext, string type)
        {
            if (type == "usd")
            {
                acontext.Output=usd(acontext.Input);
            }
            else if (type == "bdt")
            {
                acontext.Output = bdt(acontext.Input);
            }
            else if (type == "gbp")
            {
                acontext.Output=gbp(acontext.Input);
            }
            else if (type == "myr")
            {
                acontext.Output=myr(acontext.Input);
            }
        }
    }
}
