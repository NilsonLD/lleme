package uff.ic.letstalk.corbaObjects.scs;

/**
 * corbaObjects/scs/IComponentPOA.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from scs.idl Sexta-feira, 9 de Dezembro de 2005
 * 18h26min27s BRST
 */
public abstract class IComponentPOA extends org.omg.PortableServer.Servant
        implements uff.ic.letstalk.corbaObjects.scs.IComponentOperations,
        org.omg.CORBA.portable.InvokeHandler {

    // Constructors
    private static java.util.Hashtable _methods = new java.util.Hashtable();

    static {
        _methods.put("getFacet", new java.lang.Integer(0));
        _methods.put("getFacetByName", new java.lang.Integer(1));
        _methods.put("startup", new java.lang.Integer(2));
        _methods.put("shutdown", new java.lang.Integer(3));
        _methods.put("connect", new java.lang.Integer(4));
        _methods.put("disconnect", new java.lang.Integer(5));
        _methods.put("getConnection", new java.lang.Integer(6));
        _methods.put("getConnections", new java.lang.Integer(7));
        _methods.put("getFacets", new java.lang.Integer(8));
        _methods.put("getFacetsByName", new java.lang.Integer(9));
        _methods.put("getReceptacles", new java.lang.Integer(10));
        _methods.put("getReceptacleConnections", new java.lang.Integer(11));
        _methods.put("getReceptaclesByName", new java.lang.Integer(12));
    }

    public org.omg.CORBA.portable.OutputStream _invoke(String $method,
            org.omg.CORBA.portable.InputStream in,
            org.omg.CORBA.portable.ResponseHandler $rh) {
        org.omg.CORBA.portable.OutputStream out = null;
        java.lang.Integer __method = (java.lang.Integer) _methods.get($method);
        if (__method == null)
            throw new org.omg.CORBA.BAD_OPERATION(0,
                    org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

        switch (__method.intValue()) {
            case 0: // corbaObjects/scs/IComponent/getFacet
            {
                try {
                    String facet_interface = in.read_string();
                    org.omg.CORBA.Object $result = null;
                    $result = this.getFacet(facet_interface);
                    out = $rh.createReply();
                    org.omg.CORBA.ObjectHelper.write(out, $result);
                } catch (uff.ic.letstalk.corbaObjects.scs.InvalidName $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.InvalidNameHelper.write(out, $ex);
                }
                break;
            }

            case 1: // corbaObjects/scs/IComponent/getFacetByName
            {
                try {
                    String facet = in.read_string();
                    org.omg.CORBA.Object $result = null;
                    $result = this.getFacetByName(facet);
                    out = $rh.createReply();
                    org.omg.CORBA.ObjectHelper.write(out, $result);
                } catch (uff.ic.letstalk.corbaObjects.scs.InvalidName $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.InvalidNameHelper.write(out, $ex);
                }
                break;
            }

            case 2: // corbaObjects/scs/IComponent/startup
            {
                try {
                    this.startup();
                    out = $rh.createReply();
                } catch (uff.ic.letstalk.corbaObjects.scs.StartupFailed $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.StartupFailedHelper.write(out, $ex);
                }
                break;
            }

            case 3: // corbaObjects/scs/IComponent/shutdown
            {
                try {
                    this.shutdown();
                    out = $rh.createReply();
                } catch (uff.ic.letstalk.corbaObjects.scs.ShutdownFailed $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.ShutdownFailedHelper.write(out, $ex);
                }
                break;
            }

            // Receptacle
            case 4: // corbaObjects/scs/IComponent/connect
            {
                try {
                    String receptacle = in.read_string();
                    org.omg.CORBA.Object obj = org.omg.CORBA.ObjectHelper.read(in);
                    int $result = 0;
                    $result = this.connect(receptacle, obj);
                    out = $rh.createReply();
                    out.write_ulong($result);
                } catch (uff.ic.letstalk.corbaObjects.scs.InvalidName $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.InvalidNameHelper.write(out, $ex);
                } catch (uff.ic.letstalk.corbaObjects.scs.InvalidConnection $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.InvalidConnectionHelper.write(out, $ex);
                } catch (uff.ic.letstalk.corbaObjects.scs.AlreadyConnected $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.AlreadyConnectedHelper.write(out, $ex);
                } catch (uff.ic.letstalk.corbaObjects.scs.ExceededConnectionLimit $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.ExceededConnectionLimitHelper.write(out, $ex);
                }
                break;
            }

            case 5: // corbaObjects/scs/IComponent/disconnect
            {
                try {
                    int id = uff.ic.letstalk.corbaObjects.scs.ConnectionIdHelper.read(in);
                    this.disconnect(id);
                    out = $rh.createReply();
                } catch (uff.ic.letstalk.corbaObjects.scs.InvalidConnection $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.InvalidConnectionHelper.write(out, $ex);
                } catch (uff.ic.letstalk.corbaObjects.scs.NoConnection $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.NoConnectionHelper.write(out, $ex);
                }
                break;
            }

            case 6: // corbaObjects/scs/IComponent/getConnection
            {
                try {
                    int id = uff.ic.letstalk.corbaObjects.scs.ConnectionIdHelper.read(in);
                    uff.ic.letstalk.corbaObjects.scs.ConnectionDescription $result = null;
                    $result = this.getConnection(id);
                    out = $rh.createReply();
                    uff.ic.letstalk.corbaObjects.scs.ConnectionDescriptionHelper
                            .write(out, $result);
                } catch (uff.ic.letstalk.corbaObjects.scs.InvalidConnection $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.InvalidConnectionHelper.write(out, $ex);
                }
                break;
            }

            case 7: // corbaObjects/scs/IComponent/getConnections
            {
                try {
                    String receptacle = in.read_string();
                    uff.ic.letstalk.corbaObjects.scs.ConnectionDescription $result[] = null;
                    $result = this.getConnections(receptacle);
                    out = $rh.createReply();
                    uff.ic.letstalk.corbaObjects.scs.ConnectionDescriptionsHelper.write(out,
                            $result);
                } catch (uff.ic.letstalk.corbaObjects.scs.InvalidName $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.InvalidNameHelper.write(out, $ex);
                }
                break;
            }

            // MetaInterface
            case 8: // corbaObjects/scs/IComponent/getFacets
            {
                uff.ic.letstalk.corbaObjects.scs.FacetDescription $result[] = null;
                $result = this.getFacets();
                out = $rh.createReply();
                uff.ic.letstalk.corbaObjects.scs.FacetDescriptionsHelper.write(out, $result);
                break;
            }

            case 9: // corbaObjects/scs/IComponent/getFacetsByName
            {
                try {
                    String names[] = uff.ic.letstalk.corbaObjects.scs.NameListHelper.read(in);
                    uff.ic.letstalk.corbaObjects.scs.FacetDescription $result[] = null;
                    $result = this.getFacetsByName(names);
                    out = $rh.createReply();
                    uff.ic.letstalk.corbaObjects.scs.FacetDescriptionsHelper.write(out, $result);
                } catch (uff.ic.letstalk.corbaObjects.scs.InvalidName $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.InvalidNameHelper.write(out, $ex);
                }
                break;
            }

            case 10: // corbaObjects/scs/IComponent/getReceptacles
            {
                uff.ic.letstalk.corbaObjects.scs.ReceptacleDescription $result[] = null;
                $result = this.getReceptacles();
                out = $rh.createReply();
                uff.ic.letstalk.corbaObjects.scs.ReceptacleDescriptionsHelper.write(out, $result);
                break;
            }

            case 11: // corbaObjects/scs/IComponent/getReceptacleConnections
            {
                try {
                    String receptacle_interface = in.read_string();
                    uff.ic.letstalk.corbaObjects.scs.ConnectionDescription $result[] = null;
                    $result = this.getReceptacleConnections(receptacle_interface);
                    out = $rh.createReply();
                    uff.ic.letstalk.corbaObjects.scs.ConnectionDescriptionsHelper.write(out,
                            $result);
                } catch (uff.ic.letstalk.corbaObjects.scs.InvalidName $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.InvalidNameHelper.write(out, $ex);
                } catch (uff.ic.letstalk.corbaObjects.scs.InvalidConnection $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.InvalidConnectionHelper.write(out, $ex);
                } catch (uff.ic.letstalk.corbaObjects.scs.AlreadyConnected $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.AlreadyConnectedHelper.write(out, $ex);
                } catch (uff.ic.letstalk.corbaObjects.scs.ExceededConnectionLimit $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.ExceededConnectionLimitHelper.write(out, $ex);
                } catch (uff.ic.letstalk.corbaObjects.scs.InternalError $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.InternalErrorHelper.write(out, $ex);
                }
                break;
            }

            case 12: // corbaObjects/scs/IComponent/getReceptaclesByName
            {
                try {
                    String names[] = uff.ic.letstalk.corbaObjects.scs.NameListHelper.read(in);
                    uff.ic.letstalk.corbaObjects.scs.ReceptacleDescription $result[] = null;
                    $result = this.getReceptaclesByName(names);
                    out = $rh.createReply();
                    uff.ic.letstalk.corbaObjects.scs.ReceptacleDescriptionsHelper.write(out,
                            $result);
                } catch (uff.ic.letstalk.corbaObjects.scs.InvalidName $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.letstalk.corbaObjects.scs.InvalidNameHelper.write(out, $ex);
                }
                break;
            }

            default:
                throw new org.omg.CORBA.BAD_OPERATION(0,
                        org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
        }

        return out;
    } // _invoke

    // Type-specific CORBA::Object operations
    private static String[] __ids = {"IDL:corbaObjects/scs/IComponent:1.0"};

    public String[] _all_interfaces(org.omg.PortableServer.POA poa,
            byte[] objectId) {
        return __ids.clone();
    }

    public IComponent _this() {
        return IComponentHelper.narrow(super._this_object());
    }

    public IComponent _this(org.omg.CORBA.ORB orb) {
        return IComponentHelper.narrow(super._this_object(orb));
    }

} // class IComponentPOA
