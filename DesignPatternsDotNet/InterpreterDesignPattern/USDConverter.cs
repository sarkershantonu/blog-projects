using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace InterpreterDesignPattern
{
   public class USDConverter : CurrencyExpression
   {
	    public override double usd(int input) {
		    return input;
	    }
        public override double gbp(int input)
        {
		    return input*0.5987;
	    }
        public override double bdt(int input) 
        {
		    return input*77.5164;
	    }
        public override double myr(int input) 
        {
		    return input*3.3025;
	    }
    }
}
