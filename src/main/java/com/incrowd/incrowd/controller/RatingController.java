package com.incrowd.incrowd.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//@RestController
//@RequestMapping(value = "/api")
public class RatingController {

//    public static String readStringFromURL(String requestURL) throws IOException {
//        try (Scanner scanner = new Scanner(new URL(requestURL).openStream(),
//                StandardCharsets.UTF_8.toString())) {
//            scanner.useDelimiter("\\A");
//            return scanner.hasNext() ? scanner.next() : "";
//        }
//    }

    public void da() throws Exception {
//        String out1 = new Scanner(new URL("https://www.brentfordfc.com/api/incrowd/getnewlistinformation?count=50").openStream(), "UTF-8").useDelimiter("\\A").next();
        String out2 = new Scanner(new URL("http://www.brentfordfc.com/api/incrowd/getnewlistinformation?count=50").openStream(), "UTF-8").useDelimiter("\\A").next();

//        String out = new Scanner(new URL("http://rssblog.whatisrss.com/feed/").openStream(), "UTF-8").useDelimiter("\\A").next();
//        String out3 = new Scanner(new URL("https://www.digitalshadows.com/").openStream(), "UTF-8").useDelimiter("\\A").next();


// URL oracle = new URL("http://rssblog.whatisrss.com/feed/");
//        URL oracle = new URL("https://www.brentfordfc.com/api/incrowd/getnewsarticleinformation?id=173860");
        URL oracle = new URL("http://www.brentfordfc.com/api/incrowd/getnewlistinformation?count=50");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));
        String da = in.readLine();
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();

//        SyndFeed feed = new SyndFeedImpl();
//        feed.setFeedType("rss_1.0");
//        feed.setTitle("Test title");
//        feed.setLink("https://www.brentfordfc.com/api/incrowd/getnewsarticleinformation?id=173860");
//        feed.setDescription("Basic description");
//
//        SyndEntry entry = new SyndEntryImpl();
//        entry.setTitle("Entry title");
//        entry.setLink("http://www.somelink.com/entry1");
//
//        feed.setEntries(Arrays.asList(entry));

//        URL feedSource = new URL("https://www.brentfordfc.com/api/incrowd/getnewsarticleinformation?id=173860");
////        URL feedSource = new URL("http://rssblog.whatisrss.com/feed/");
//        SyndFeedInput input = new SyndFeedInput();
//        SyndFeed feed = input.build(new XmlReader(feedSource));

//        CloseableHttpClient client = HttpClientBuilder.create().build();
//        HttpGet request = new HttpGet("https://www.brentfordfc.com/api/incrowd/getnewsarticleinformation?id=173860");
//
//        HttpResponse response = client.execute(request);
//        HttpEntity entity = response.getEntity();


    }
//    private final RestTemplate restTemplate;
//
//    public RatingController(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    /**
//     * Produces a list of authorities, for the select dropdown
//     *
//     * @return list of authorities
//     */
//    @RequestMapping(value = "", produces = "application/json")
//    public List<Authority> getList() {
//        AsyncHttpClient client = Dsl.asyncHttpClient();
//        BoundRequestBuilder getRequest = client.prepareGet("http://www.baeldung.com");
//
//        Future<Response> responseFuture = client.executeRequest(unboundRequest);
//        responseFuture.get();
//
//        Request getRequest = Dsl.get("http://www.baeldung.com").build();
//        JAXBContext jc = JAXBContext.newInstance();
//        Unmarshaller uns = jc.createUnmarshaller();
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("x-api-version", "2");
//        HttpEntity<FSAAuthorityList> entity = new HttpEntity<>(headers);
//
//        ResponseEntity<FSAAuthorityList> restRes = restTemplate
//                .exchange("https://www.brentfordfc.com/api/incrowd/getnewsarticleinformation?id=173860",
//                        HttpMethod.GET, entity, FSAAuthorityList.class);
//
//        FSAAuthorityList res = restRes.getBody();
//
//        List<Authority> authorityList = new ArrayList<>();
//        for (FSAAuthority fsaAuthority : res.getFsaAuthorityList()) {
//            authorityList.add(new Authority(fsaAuthority.getId(), fsaAuthority.getName()));
//        }
//        System.out.println(authorityList);
//        System.out.println("ffffffffffffffffffffffffff");
//        return authorityList;
//    }

//    /**
//     * Produces the ratings for a specific authority for the table
//     *
//     * @param authorityId the authority to calculate ratings for
//     * @return the ratings to display
//     */
//    @RequestMapping(value = "/{authorityId}", produces = "application/json")
//    public List<AuthorityRatingItem> getAuthority(@PathVariable("authorityId") int authorityId) {


//        HttpHeaders headers = new HttpHeaders();
//        headers.set("x-api-version", "2");
//        HttpEntity<FSAAuthorityList> entity = new HttpEntity<>(headers);
//
//        ResponseEntity<EstablishmentList> restRes = restTemplate.exchange("http://api.ratings.food.gov.uk/Establishments?authorityId=" + authorityId, HttpMethod.GET, entity, EstablishmentList.class);
//
//        EstablishmentList res = restRes.getBody();
//        int establishmentSise = res.getEstablishments().size();
//
//
//        List<EstablishmentList> establishmentLists = new ArrayList<>();
//        Map<String,Integer > estbMap = new HashMap<>();
//
//        for(Establishment e : res.getEstablishments()){
//            int i = 0;
//            if( !estbMap.containsKey(e.getRatingValue()) ){
//                estbMap.put(e.getRatingValue(), i);
//
//            }else {
//
//                int counter  =  estbMap.get(e.getRatingValue());
//                estbMap.put(e.getRatingValue(), counter)  ;
//            }
//        }
//
//        for()


//    }


}