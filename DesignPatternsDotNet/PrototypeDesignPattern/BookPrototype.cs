using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PrototypeDesignPattern
{
    interface IBookPrototype : ICloneable
    {
        object Clone();
    }
}
