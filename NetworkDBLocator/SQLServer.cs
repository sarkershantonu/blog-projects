using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DbLocator
{
    public class SQLServer
    {
        public string PCName { get; set; }
        public string InstanceName { get; set; }
        public string IP { get; set; }
        public string Version { get; set; }
        public bool IsClustered { get; set; }
    }
}
