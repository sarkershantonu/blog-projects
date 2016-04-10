using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace VisitorPattern
{
    interface ITaxable
    {
        double AddTaxMonitor(ITaxMonitor taxMonitor);
    }
}
