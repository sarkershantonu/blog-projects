using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace InterpreterDesignPattern
{
   public class BDTConverter : CurrencyExpression{
	public override double usd(int input) {
		return input*0.0129;
	}
    public override double gbp(int input)
    {
		return input*0.0077;
	}
    public override double bdt(int input)
    {
		return input;
	}
    public override double myr(int input)
    {
		return input*0.0426;
	}
}
}
