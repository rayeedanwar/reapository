using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;

namespace Teaweoitingwekeke
{
    [TestFixture]

    class NUnitTest
    {
        [Test]
        public void Method1()
        {
            Console.WriteLine("Hello World!");
        }

        [SetUp]
        public void Before()
        {
            Console.WriteLine("Before - ");
        }

        [TearDown]
        public void After()
        {
            Console.WriteLine("After - ");
        }
    }
}
