using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MediatorDesignPattern
{
    class Administrators : Employee
    {
        public Administrators(IMediator aMeadiator) :base(aMeadiator){
		Console.WriteLine("Administrators have signed up for schooling \n");
	}
    }
}
