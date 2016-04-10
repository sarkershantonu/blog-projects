using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MediatorDesignPattern
{
    class Developer:Employee
    {
        public Developer(IMediator aMeadiator) : base(aMeadiator){		
		Console.WriteLine("Developers have signed up for schooling \n");
	}
    }
}
