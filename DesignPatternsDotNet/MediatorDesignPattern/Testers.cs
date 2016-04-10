using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MediatorDesignPattern
{
    class Testers : Employee
    {
        public Testers(IMediator moderator)
            : base(moderator)
        {
            Console.WriteLine("Testers have signed up for schooling \n");
        }
    }
}
