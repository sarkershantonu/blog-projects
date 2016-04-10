using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace InterpreterDesignPattern
{
    public class GBPConverter : CurrencyExpression
    {
        public override double usd(int input)
        {
            return input * 1.6703;
        }
        public override double gbp(int input)
        {
            return input;
        }
        public override double bdt(int input)
        {
            return input * 129.4726;
        }
        public override double myr(int input)
        {
            return input * 5.5160;
        }
    }
}
