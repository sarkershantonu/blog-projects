using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BuilderPattern
{
    interface IMobile
    {
         string Display { get; set; }
         string Keypad { get; set; }
         string Mike { get; set; }
         string Speaker { get; set; }
         string Network { get; set; }
    }
}
