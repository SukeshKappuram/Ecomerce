<%-- 
    Document   : SignUp
    Created on : Aug 3, 2017, 7:26:15 PM
    Author     : iamsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <form method='post' action='User'>
            <fieldset>
                <legend>Login</legend>
                <table>
                    <tr>
                        <td><input type='email' name='mailId' placeholder='Email Id' required="required"/></td>
                        <td><input type='password' name='password' placeholder='Password' required="required"/></td>
                        <td><input type='submit' value='Login'/><td>
                    </tr>
                </table>
            </fieldset>
            </form>
            
            
            <form method='post' action='User'>
            <fieldset>
                <legend>Sign Up</legend>
                <table>
                    <tr>
                        <td><input type='text' name='firstName' placeholder='First Name' required="required"/></td>
                    </tr>
                    <tr>
                        <td><input type='text' name='lastName' placeholder='Last Name' required="required"/></td>
                    </tr>
                    <tr>
                        <td>
                            <label> Gender </label>
                            <input type="radio" name="gender" value="Male" checked> 
                            <label> Male </label>
                            <input type="radio" name="gender" value="Female"> 
                            <label> Female </label>
                        </td>
                    </tr>
                    <tr>
                        <td><input type='date' name='dob' placeholder='dd/MM/yyyy' required="required"/></td>
                    </tr>
                    <tr>
                        <td><input type='email' name='mailId' placeholder='Email Id' required="required"/></td>
                    </tr>
                    <tr>
                        <td><input type='tel' name='phoneNumber' placeholder='Mobile number' pattern="[0-9]{10}" required="required"/></td>
                    </tr>
                    <tr>
                        <td><input type='password' name='password' placeholder='Password' required="required"/></td>
                    </tr>
                    <tr>
                        <td><input type='password' name='cpassword' placeholder='Confirm Password' required="required"/></td>
                    </tr>
                    <tr>
                        <td><input type='submit' value='Sign Up'/><td>
                    </tr>
                </table>
            </fieldset>
            </form>
        </div>
    </body>
</html>
