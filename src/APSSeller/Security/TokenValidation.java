package APSSeller.Security;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import APSSeller.Security.*;

public class TokenValidation {
  protected NObject javonetHandle;

  public TokenValidation() {
    try {
      javonetHandle = Javonet.New("APSSeller.Security.TokenValidation");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TokenValidation(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean isAuthorizedBuy(
      java.lang.String Seed,
      java.lang.String ReloadID,
      java.lang.String Amount,
      java.lang.String Time,
      java.lang.String token) {
    try {
      java.lang.Boolean res =
          Javonet.getType("APSSeller.Security.TokenValidation")
              .invoke("isAuthorizedBuy", Seed, ReloadID, Amount, Time, token);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean isAuthorizedQuery(
      TokenValidation.QueryTokenObject queryObject, java.lang.String token, java.lang.String Seed) {
    try {
      java.lang.Boolean res =
          Javonet.getType("APSSeller.Security.TokenValidation")
              .invoke("isAuthorizedQuery", queryObject, token, Seed);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String BuyToken(
      TokenValidation.BuyTokenObject buyObject, AtomicReference<java.lang.String> Time) {
    try {
      java.lang.String res =
          Javonet.getType("APSSeller.Security.TokenValidation")
              .invoke("BuyToken", buyObject, new NRef(Time));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String QueryToken(
      TokenValidation.QueryTokenObject query, AtomicReference<java.lang.String> Time) {
    try {
      java.lang.String res =
          Javonet.getType("APSSeller.Security.TokenValidation")
              .invoke("QueryToken", query, new NRef(Time));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public static class QueryTokenObject {
    protected NObject javonetHandle;
    /** SetProperty */
    @MethodTypeAnnotation(type = "SetField")
    public void setSeed(java.lang.String value) {
      try {
        javonetHandle.set("Seed", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getSeed() {
      try {
        java.lang.String res = javonetHandle.get("Seed");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setTime(java.lang.String value) {
      try {
        javonetHandle.set("Time", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getTime() {
      try {
        java.lang.String res = javonetHandle.get("Time");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setUserID(java.lang.Integer value) {
      try {
        javonetHandle.set("UserID", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getUserID() {
      try {
        java.lang.Integer res = javonetHandle.get("UserID");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }

    public QueryTokenObject() {
      try {
        javonetHandle = Javonet.New("APSSeller.Security.TokenValidation+QueryTokenObject");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public QueryTokenObject(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class BuyTokenObject {
    protected NObject javonetHandle;
    /** SetProperty */
    @MethodTypeAnnotation(type = "SetField")
    public void setSeed(java.lang.String value) {
      try {
        javonetHandle.set("Seed", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getSeed() {
      try {
        java.lang.String res = javonetHandle.get("Seed");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setReloadID(java.lang.String value) {
      try {
        javonetHandle.set("ReloadID", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getReloadID() {
      try {
        java.lang.String res = javonetHandle.get("ReloadID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setAmount(java.lang.String value) {
      try {
        javonetHandle.set("Amount", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getAmount() {
      try {
        java.lang.String res = javonetHandle.get("Amount");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public BuyTokenObject() {
      try {
        javonetHandle = Javonet.New("APSSeller.Security.TokenValidation+BuyTokenObject");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public BuyTokenObject(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
