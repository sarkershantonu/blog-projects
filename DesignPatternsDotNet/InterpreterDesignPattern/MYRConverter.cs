using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace InterpreterDesignPattern
{
   public class MYRConverter : CurrencyExpression{
	public override double usd(int input) {
		return input*0.3028;
	}
    public override double gbp(int input)
    {
		return input*0.1813;
	}
    public override double bdt(int input)
    {
		return input*23.4720;
	}
    public override double myr(int input)
    {
		return input;
	}
}
}
