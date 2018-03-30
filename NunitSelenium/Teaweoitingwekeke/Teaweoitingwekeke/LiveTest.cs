using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NPOI.SS.UserModel;
using NPOI.XSSF.UserModel;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support.PageObjects;

namespace Teaweoitingwekeke
{
    [TestFixture]

    class SeleniumExample
    {
        private IWebDriver driver;

        [SetUp]
        public void SetUp()
        {
            driver = new ChromeDriver();

        }


        [Test]
        public void POIExample()
        {
           ExcelExercise excelExercise = new ExcelExercise();
            PageFactory.InitElements(driver, excelExercise);
            //go to webpage
            driver.Navigate().GoToUrl("http://php.thedemosite.co.uk/");


            XSSFWorkbook workbook;
            using (FileStream file = new
                FileStream(@"C:\\Users\\Admin\\Desktop\\Automated Testing\\Example.xlsx", FileMode.Open, FileAccess.Read))
            {

                workbook = new XSSFWorkbook(file);

            }

            Page TestCase = new Page();
            PageFactory.InitElements(driver, TestCase);

            ISheet sheet = workbook.GetSheet("Inputs");
            for (int row = 0; row <= sheet.LastRowNum; row++)
            {
                if (sheet.GetRow(row) != null) //null is when the row only conatins empty cells
                {


                    string userName = sheet.GetRow(row).GetCell(3).StringCellValue;
                    string passWord = sheet.GetRow(row).GetCell(4).StringCellValue;
                    string expected = sheet.GetRow(row).GetCell(5).StringCellValue;


                    TestCase.addNewUser(userName, passWord);
                    string status = TestCase.login(userName, passWord);

                   // Assert.AreEqual(expected, status, "MESSED UP DAWG U CRAZY");




                }
            }



        }
    }
}

