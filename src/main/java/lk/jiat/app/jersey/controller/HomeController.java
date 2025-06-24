package lk.jiat.app.jersey.controller;

import jakarta.inject.Inject;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lk.jiat.app.jersey.model.User;
import org.apache.commons.io.FilenameUtils;
import org.glassfish.jersey.media.multipart.ContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.server.mvc.Viewable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@Path("/")
public class HomeController {

    @Inject
    private User user;

    @Context
    ServletContext context;

    @GET
    public Viewable index() {

        Map<String, Object> model = new HashMap<>();
        model.put("title", "J2EE Home");

        return new Viewable("/index", model);
    }

    @POST
    @Path("/file_upload")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response fileUpload(@FormDataParam("file") FormDataBodyPart body) {

        body.getParent().getBodyParts().forEach(part -> {

            InputStream is = part.getEntityAs(InputStream.class);

            String fileName = body.getContentDisposition().getFileName();
            String extension = FilenameUtils.getExtension(fileName);

            try {
                int read = 0;
                byte[] buffer = new byte[1024];

                String realPath = context.getRealPath("/");
                java.nio.file.Path uploadPath = Paths.get(realPath+"/upload");

                if (!Files.exists(uploadPath)) {
                    try {
                        Files.createDirectory(uploadPath);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                FileOutputStream out =
                        new FileOutputStream(new File(uploadPath+"/"+System.currentTimeMillis()+"."+extension));

                while ((read = is.read(buffer)) != -1) {
                    out.write(buffer, 0, read);
                }

                out.flush();
                out.close();

            } catch (IOException e) {
                e.printStackTrace();
            }


        });

//        InputStream content = body.getContent();

//        String fileName = body.getContentDisposition().getFileName();
//        String extension = FilenameUtils.getExtension(fileName);
//
//        try {
//            int read = 0;
//            byte[] buffer = new byte[1024];
//
//            String realPath = context.getRealPath("/");
//            java.nio.file.Path uploadPath = Paths.get(realPath+"/upload");
//
//            if (!Files.exists(uploadPath)) {
//                try {
//                    Files.createDirectory(uploadPath);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            FileOutputStream out =
//                    new FileOutputStream(new File(uploadPath+"/"+System.currentTimeMillis()+"."+extension));
//
//            while ((read = content.read(buffer)) != -1) {
//                out.write(buffer, 0, read);
//            }
//
//            out.flush();
//            out.close();
//
//        } catch (IOException e) {
//        }

        return Response.ok().build();
    }
}
