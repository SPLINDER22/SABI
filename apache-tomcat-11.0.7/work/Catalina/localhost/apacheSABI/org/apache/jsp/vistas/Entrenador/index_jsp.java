/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/11.0.7
 * Generated at: 2025-07-01 05:39:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.vistas.Entrenador;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/plantillas/dashEntrenador.jsp", Long.valueOf(1751345636455L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
String contextPath = request.getContextPath();
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>SABI Entrenadores</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( contextPath);
      out.write("/estilos/indexEntre.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("            .pattern-bg {\r\n");
      out.write("                background-image: url('../recursos/fondoSabiNuevo.png');\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"pattern-bg\">\r\n");
      out.write("        <!-- Header -->\r\n");
      out.write("        ");

    Modelo.Usuario entrenador = (Modelo.Usuario) session.getAttribute("logger");

      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( contextPath);
      out.write("/estilos/barranavegacion.css\">\r\n");
      out.write("<header class=\"superior\">\r\n");
      out.write("    <div class=\"izquierda\">\r\n");
      out.write("        <img src=\"");
      out.print( contextPath);
      out.write("/recursos/logoLargo.png\" alt=\"Logo\" class=\"logo\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <a href=\"");
      out.print( request.getContextPath());
      out.write("/vistas/Entrenador/index.jsp\">\r\n");
      out.write("            <span>Inicio</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"");
      out.print( contextPath);
      out.write("/RutinaController?accion=Read\">\r\n");
      out.write("            <span>Rutinas</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"");
      out.print( request.getContextPath());
      out.write("/SuscripcionController?menu=Suscripciones&accion=listarEntrenador&idEntrenador=");
      out.print( entrenador.getIdUsuario() );
      out.write("\">\r\n");
      out.write("            <span>Suscripciones</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"derecha\">\r\n");
      out.write("        <a href=\"");
      out.print( request.getContextPath());
      out.write("/CerrarSesion\">\r\n");
      out.write("            <span>Cerrar Sesion</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <img src=\"");
      out.print( contextPath);
      out.write("/recursos/entrenador.jpg\" alt=\"user\" class=\"user\">\r\n");
      out.write("        <span>");
      out.print( entrenador.getNomUsuario() );
      out.write(' ');
      out.print( entrenador.getApeUsuario() );
      out.write(' ');
      out.write('|');
      out.write(' ');
      out.print( entrenador.getRolUsuario() );
      out.write("</span>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Main Content -->\r\n");
      out.write("        <main class=\"main-content\">\r\n");
      out.write("            <div class=\"dashboard-container\">\r\n");
      out.write("                <!-- Welcome Section -->\r\n");
      out.write("                <section class=\"welcome-section\">\r\n");
      out.write("                    <h1>Bienvenido, ");
      out.print( entrenador.getNomUsuario() );
      out.write(' ');
      out.print( entrenador.getApeUsuario() );
      out.write("</h1>\r\n");
      out.write("                    <p>Aquí tienes un resumen de tu actividad como entrenador en SABI</p>\r\n");
      out.write("                </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Stats Grid -->\r\n");
      out.write("                <section class=\"stats-grid\">\r\n");
      out.write("                    <div class=\"stat-card\">\r\n");
      out.write("                        <div class=\"stat-icon\">👥</div>\r\n");
      out.write("                        <div class=\"stat-content\">\r\n");
      out.write("                            <h3>28</h3>\r\n");
      out.write("                            <p>Clientes Activos</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"stat-card\">\r\n");
      out.write("                        <div class=\"stat-icon\">💪</div>\r\n");
      out.write("                        <div class=\"stat-content\">\r\n");
      out.write("                            <h3>45</h3>\r\n");
      out.write("                            <p>Rutinas Creadas</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"stat-card\">\r\n");
      out.write("                        <div class=\"stat-icon\">⭐</div>\r\n");
      out.write("                        <div class=\"stat-content\">\r\n");
      out.write("                            <h3>4.8</h3>\r\n");
      out.write("                            <p>Calificación</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("\r\n");
      out.write("                <!-- Content Grid -->\r\n");
      out.write("                <section class=\"content-grid\">\r\n");
      out.write("                    <!-- Recent Clients -->\r\n");
      out.write("                    <div class=\"content-card\">\r\n");
      out.write("                        <div class=\"card-header\">\r\n");
      out.write("                            <h2>Clientes Recientes</h2>\r\n");
      out.write("                            <a href=\"#\" class=\"view-all\">Ver todos</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"client-list\">\r\n");
      out.write("                            <div class=\"client-item\">\r\n");
      out.write("                                <div class=\"client-avatar\">MG</div>\r\n");
      out.write("                                <div class=\"client-info\">\r\n");
      out.write("                                    <h4>María González</h4>\r\n");
      out.write("                                    <p>Última sesión: Hoy</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"client-status active\">Activo</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"client-item\">\r\n");
      out.write("                                <div class=\"client-avatar\">CR</div>\r\n");
      out.write("                                <div class=\"client-info\">\r\n");
      out.write("                                    <h4>Carlos Rodríguez</h4>\r\n");
      out.write("                                    <p>Última sesión: Ayer</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"client-status active\">Activo</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"client-item\">\r\n");
      out.write("                                <div class=\"client-avatar\">LM</div>\r\n");
      out.write("                                <div class=\"client-info\">\r\n");
      out.write("                                    <h4>Laura Martínez</h4>\r\n");
      out.write("                                    <p>Última sesión: 2 días</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"client-status inactive\">Inactivo</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"client-item\">\r\n");
      out.write("                                <div class=\"client-avatar\">AP</div>\r\n");
      out.write("                                <div class=\"client-info\">\r\n");
      out.write("                                    <h4>Ana Pérez</h4>\r\n");
      out.write("                                    <p>Última sesión: Hoy</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"client-status active\">Activo</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!-- Popular Routines -->\r\n");
      out.write("                    <div class=\"content-card\">\r\n");
      out.write("                        <div class=\"card-header\">\r\n");
      out.write("                            <h2>Rutinas Más Populares</h2>\r\n");
      out.write("                            <a href=\"#\" class=\"view-all\">Ver todas</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"routine-list\">\r\n");
      out.write("                            <div class=\"routine-item\">\r\n");
      out.write("                                <div class=\"routine-info\">\r\n");
      out.write("                                    <h4>Fuerza Funcional</h4>\r\n");
      out.write("                                    <p>15 usuarios activos</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"routine-stats\">\r\n");
      out.write("                                    <span class=\"usage-count\">85%</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"routine-item\">\r\n");
      out.write("                                <div class=\"routine-info\">\r\n");
      out.write("                                    <h4>Cardio Intensivo</h4>\r\n");
      out.write("                                    <p>12 usuarios activos</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"routine-stats\">\r\n");
      out.write("                                    <span class=\"usage-count\">72%</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"routine-item\">\r\n");
      out.write("                                <div class=\"routine-info\">\r\n");
      out.write("                                    <h4>Flexibilidad y Movilidad</h4>\r\n");
      out.write("                                    <p>8 usuarios activos</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"routine-stats\">\r\n");
      out.write("                                    <span class=\"usage-count\">58%</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"routine-item\">\r\n");
      out.write("                                <div class=\"routine-info\">\r\n");
      out.write("                                    <h4>Principiantes</h4>\r\n");
      out.write("                                    <p>6 usuarios activos</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"routine-stats\">\r\n");
      out.write("                                    <span class=\"usage-count\">45%</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
