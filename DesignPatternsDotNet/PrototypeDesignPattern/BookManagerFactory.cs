using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PrototypeDesignPattern
{
    class BookManagerFactory
    {
        public IBookPrototype getClone(IBookPrototype abook)
        {
            return (IBookPrototype)abook.Clone();
        }
    }
}
