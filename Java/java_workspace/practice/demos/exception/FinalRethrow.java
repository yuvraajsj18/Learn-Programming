package exception;

class FE extends Exception { }

class SE extends Exception { }

class FinalRethrow
{
    public static void main(String[] args) throws FE, SE {
        try
        {
            boolean flag = true;
            if (flag)
                throw new FE();
            else
                throw new SE();
        }
        catch (FE e)
        {
            throw e;
        }
        catch (SE e)
        {
            throw e;
        }
    }
}