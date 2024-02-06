package com.example.routes
import com.example.models.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.customerRouting(){
    route("/customer"){
        get{
            if (customers.isNotEmpty()) call.respond(customers)
            else call.respondText("No customers found", status = HttpStatusCode.OK)
        }
        get("{id?}") {
            val id = call.parameters["id"]?: return@get call.respondText("Missing Id", status = HttpStatusCode.BadRequest)
            val customer = customers.find { it.id == id } ?: return@get call.respondText("No customer with that id-$id was found", status= HttpStatusCode.NotFound)
            call.respond(customer)
        }
        post {
            val customer = call.receive<Customer>()
            customers.add(customer)
            call.respondText("Customer added successfully", status = HttpStatusCode.Created)
        }
        delete("{id?}") {
            val id = call.parameters["id"]?: return@delete call.respondText("Missing Id", status = HttpStatusCode.BadRequest)
            if (customers.removeIf{it.id == id}) call.respondText("Customer removed.", status = HttpStatusCode.Accepted)
            else call.respondText("Not found", status = HttpStatusCode.NotFound)
        }
    }

}