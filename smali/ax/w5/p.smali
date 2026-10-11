.class public final synthetic Lax/w5/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/y5/b$a;


# instance fields
.field public final synthetic a:Lax/w5/r;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lax/w5/r;Ljava/util/Map;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/w5/p;->a:Lax/w5/r;

    iput-object p2, p0, Lax/w5/p;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/w5/p;->a:Lax/w5/r;

    iget-object v1, p0, Lax/w5/p;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lax/w5/r;->h(Lax/w5/r;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
