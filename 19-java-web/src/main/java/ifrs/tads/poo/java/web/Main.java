package ifrs.tads.poo.java.web;

import spark.*;

public class Main {

    public static void main(String[] args) {
        
        Spark.get("/hello/:nome",new Route() {
            @Override
            public Object handle(Request requisicao, Response resposta) throws Exception {
                String nome = requisicao.params("nome");
                return "<b>Hello " + nome + "!!!</b>";
                // return "<html><head></head><body><h1>" + nome + "</h1></body></html>";
            }
        });
        
        Spark.get("/teste", new Route() {
            @Override
            public Object handle(Request rqst, Response rspns) throws Exception {
                return "resultado do servidor do marcio";
            }
        });
        
        // http://localhost:4567/soma?x=1&y=2
        // https://google.com/search?q=bikeshedding
        Spark.get("/soma", new Route() { 
            @Override
            public Object handle(Request req, Response rspns) throws Exception {
                int x = req.queryMap("x").integerValue();
                int y = req.queryMap("y").integerValue();
                return x + y + "";
            }
        
        });
                
        // http://localhost:4567/soma2/1/2
        // https://translate.google.com/#es/en/coche
        Spark.get("/soma2/:x/:y", new Route() {
            @Override
            public Object handle(Request req, Response rspns) throws Exception {
               int x = Integer.parseInt(req.params("x"));
               int y = Integer.parseInt(req.params("y"));
               return x + y + "";
            }
        });
        
    }
    
}
