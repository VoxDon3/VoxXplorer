.class public final synthetic Lax/B0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/B0/h;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lax/B0/h;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/B0/b;->q:Ljava/lang/String;

    iput-object p2, p0, Lax/B0/b;->c0:Lax/B0/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/B0/b;->q:Ljava/lang/String;

    iget-object v1, p0, Lax/B0/b;->c0:Lax/B0/h;

    invoke-static {v0, v1}, Lax/B0/c;->a(Ljava/lang/String;Lax/B0/h;)V

    return-void
.end method
