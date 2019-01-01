def stringTest = "cust-service-1.4.0-SNAPSHOT-1.2.3.war";
def pattern = "[0-9].[0-9].[0-9]";
def myMatcher = stringTest =~ pattern;
if(myMatcher.find())
{
    def start = myMatcher.start();
    def end = myMatcher.end();
    println(stringTest.substring(start,end));
}