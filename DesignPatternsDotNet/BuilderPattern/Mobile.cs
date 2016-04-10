using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BuilderPattern
{
    class Mobile:IMobile
    {
        public string Display { get; set; }
        public string Keypad { get; set; }
        public string Mike { get; set; }
        public string Speaker { get; set; }
        public string Network { get; set; }
    }
}
